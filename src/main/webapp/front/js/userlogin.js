/**
 * 
 */

var vm = new Vue({
    el:'#login',
    data:{
    	username:null,
    	usermsg:null,
    	password:null,
    	passmsg:null,
    	loginmsg:null
    	
    },
    methods:{
    	userlogin:function(){
    		if(this.username==null || this.username==""){
    			this.usermsg="账号不能为空"
    				return;
    		}else if(this.password==null || this.password==""){
    			this.usermsg=null;
    			this.passmsg="密码不能为空"
    				return;
    		}
    		this.passmsg=null;
    		var options = {username:this.username,password:this.password};
    		this.$http.post('../user/login.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				this.loginmsg="登录成功，即将跳转";
    				setTimeout(function(){ 
    					location.href="index.html";
    				}, 1500);
    			}else{
    				this.loginmsg="账号或密码错误";
    			}
    			
            },function(res){
                
            });
    	}
    	
	}
});

