/**
 * 
 */

var vm = new Vue({
    el:'#productinfo',
    data:{
    	id:null,
    	name:null,
    	market_price:null,
    	shop_price:null,
    	img:null,
    	decoration:null,
    	is_hot:null,
    	date:null,
    	cateName:null,
    	msg:null,
    	count:1,
    	total:null,
    	flag:0,
    	commentList:[],
		imgList:[],
    	
    },
    created:function(){
    	this.product();
    	this.getImgList();
    },
    methods:{
    	product:function(){
    		var pid = location.search.split("=")[1];
    		this.$http.post('../product/findOne.do',{id:pid},{emulateJSON:true}).then(function(res){
    			this.id=res.body.id;
    			this.name=res.body.name;
    			this.market_price=res.body.market_price;
    			this.shop_price=res.body.shop_price;
    			this.img=res.body.img;
    			this.decoration=res.body.decoration;
    			this.is_hot=res.body.is_hot;
    			this.date=res.body.date;
    			this.cateName=res.body.category.name;
    			//this.commentList=res.body.commentList;
    			this.total=this.shop_price;
            },function(res){
                
            });
    	},
		getImgList:function(){
			var pid = location.search.split("=")[1];
			this.$http.post('../product/getProductDesByPid.do',{pid:pid},{emulateJSON:true}).then(function(res){
				this.imgList = res.body;
			},function(res){

			});
		},
    	addCart:function(){
    		var options = {pId:this.id,count:this.count};
    		this.$http.post('../cart/addCart.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				this.msg="添加购物车成功"
    			}else{
    				this.msg="添加购物车失败"
    			}
    			
            },function(res){
                
            });
    	},
    	addCount:function(){
    		this.count = this.count+1;
    	},
    	deCount:function(){
    		this.count = this.count-1;
    	},
    	jishao:function(){
    		this.flag=0;
    	},
    	pinglun:function(){
    		this.flag=1;
    		/*var options = {pId:this.id,count:this.count};
    		this.$http.post('../cart/addCart.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				this.msg="添加购物车成功"
    			}else{
    				this.msg="添加购物车失败"
    			}
    			
            },function(res){
                
            });*/
    	}
    	
    	
    	
	},
	watch: {
		count: function() {
			this.total = this.shop_price*this.count;
		}
	}
});

