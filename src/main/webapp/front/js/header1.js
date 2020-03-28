/**
 * 
 */

var vm = new Vue({
    el:'#header',
    data:{
    	username:null,
    },
    created:function(){
    	this.zhanshi();
    },
    methods:{
    	zhanshi:function(){
    		this.$http.post('../user/zhanshi.do',{emulateJSON:true}).then(function(res){
            	if(res.body.username == null){
            		
            	}else{
            		this.username = res.body.username;
            	}
            	
            },function(res){
                
            });
    	},
    	logout:function(){
    		this.$http.post('../user/logout.do',{emulateJSON:true}).then(function(res){
    			top.location.href="login.html";
            },function(res){
                
            });
    	}
    	
	}
});

