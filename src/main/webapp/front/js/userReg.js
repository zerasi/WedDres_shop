/**
 * 
 */

var vm = new Vue({
    el:'#userReg',
    data:{
    	username:null,
    	password:null,
    	sex:null,
    	real_name:null,
    	email:null,
    	acc_nbr:null,
    	styleObj:null,
    	msg:null,
    },
    created:function(){
    	
    },
    methods:{
    	register:function(){
    		if(this.username==null){
    			this.styleObj={'color': 'red'};
	    		this.msg="用户名不能为空"
    		}else{
	    		this.msg=null;
    			if(this.password==null){
        			this.styleObj={'color': 'red'};
    	    		this.msg="密码不能为空"
        		}else{
        			this.msg=null;
        			var re = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
        			if(!re.test(this.email)){
        				this.styleObj={'color': 'red'};
        	    		this.msg="邮箱格式不正确"
        			}else{
        				this.msg=null;
        				var re = /^1\d{10}$/;
            			if(!re.test(this.acc_nbr)){
            				this.styleObj={'color': 'red'};
            	    		this.msg="手机号码格式不正确"
            			}else{
            				this.msg=null;
            				var options={username:this.username,password:this.password,sex:this.sex,real_name:this.real_name,email:this.email,acc_nbr:this.acc_nbr};
            	        	this.$http.post('../user/add.do',options,{emulateJSON:true}).then(function(res){
            	            	if(res.body.success){
            	            		this.styleObj={'color': 'green'};
            	            		this.msg="注册成功，赶快登录去吧！"
            	            	}
            	            },function(res){
            			        	this.styleObj={'color': 'red'};
            			    		this.msg="注册失败，请重试！"
            	            });
            			}
        			}
        		}
    		}
    	}
    	
	}
});

