/**
 * 
 */

var vm = new Vue({
    el:'#cartDetail',
    data:{
    	cartList:[],
    	totalCount:null,
    	allfee:null,
    },
    created:function(){
    	this.innit();
    },
    methods:{
    	innit:function(){
    		this.$http.post('../cart/findCart.do',{emulateJSON:true}).then(function(res){
    			this.cartList=res.body.cartList;
    			this.totalCount = res.body.totalCount;
    			this.allfee = res.body.allfee;
            },function(res){
                
            });
    	},
    	subOrder:function(){
    		location.href="place_order.html"
    	},
    	delcart:function(pid,count){
    		var options = {pId:pid,count:count};
    		this.$http.post('../cart/delCart.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				this.innit();
    			}
    			
            },function(res){
                
            });
    	},
    	addCount:function(pid,count){
    		var options = {pId:pid,count:count};
    		this.$http.post('../cart/addCount.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				this.innit();
    			}
    			
    		},function(res){
    			
    		});
    	},
    	subCount:function(pid,count){
    		var options = {pId:pid,count:count};
    		this.$http.post('../cart/subCount.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				this.innit();
    			}
    			
    		},function(res){
    			
    		});
    	},
    	
	}
});

