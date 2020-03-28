/**
 * 
 */

var vm = new Vue({
    el:'#userEdit',
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
    	this.innit();
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
            				var options={id:this.id,username:this.username,password:this.password,sex:this.sex,real_name:this.real_name,email:this.email,acc_nbr:this.acc_nbr};
            	        	this.$http.post('../user/userEdit.do',options,{emulateJSON:true}).then(function(res){
            	            	if(res.body.success){
            	            		this.styleObj={'color': 'green'};
            	            		this.msg="修改成功"
            	            	}
            	            },function(res){
            			        	this.styleObj={'color': 'red'};
            			    		this.msg="修改失败，请重试！"
            	            });
            			}
        			}
        		}
    		}
    	},
    	innit:function(){
    		this.$http.post('../user/zhanshi.do',{emulateJSON:true}).then(function(res){
    			this.id = res.body.id;
    			this.username = res.body.username;
    	    	this.password = res.body.password;
    	    	this.sex = res.body.sex;
    	    	this.real_name = res.body.real_name;
    	    	this.email = res.body.email;
    	    	this.acc_nbr = res.body.acc_nbr;
            },function(res){
		        	this.styleObj={'color': 'red'};
		    		this.msg="修改失败，请重试！"
            });
    	}
    	
	}
});

