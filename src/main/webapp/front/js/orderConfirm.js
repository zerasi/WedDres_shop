/**
 * 
 */

var vm = new Vue({
    el:'#orderConfirm',
    data:{
    	orderList:[],
    	totalCount:null,
    	allfee:null,
    	buyer_name:null,
    	buyer_phone:null,
    	buyer_postal:null,
    	buyer_ads:null,
		buyer_email:null,
    },
    created:function(){
    	this.innit();
    },
    methods:{
    	innit:function(){
    		this.$http.post('../cart/orderConfirm.do',{emulateJSON:true}).then(function(res){
    			this.orderList=res.body.orderList;
    			this.totalCount = res.body.totalCount;
    			this.allfee = res.body.allfee;
            },function(res){
                
            });
    	},
    	subOrder:function(){
    		var options = {buyer_name:this.buyer_name,buyer_email:this.buyer_email,buyer_phone:this.buyer_phone,buyer_postal:this.buyer_postal,buyer_ads:this.buyer_ads};
    		this.$http.post('../custOrder/subOrder.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				location.href="user_center_order.html"
    			}else{
    				alert("失败");
    			}
    			
            },function(res){
                
            });
    	}
    	
    	
	}
});

