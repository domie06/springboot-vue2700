import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import news from '@/views/modules/news/list'
    import xinwen from '@/views/modules/xinwen/list'
    import xinwenCollection from '@/views/modules/xinwenCollection/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yonghufenxiang from '@/views/modules/yonghufenxiang/list'
    import yonghufenxiangCollection from '@/views/modules/yonghufenxiangCollection/list'
    import config from '@/views/modules/config/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXinwen from '@/views/modules/dictionaryXinwen/list'
    import dictionaryXinwenCollection from '@/views/modules/dictionaryXinwenCollection/list'
    import dictionaryYonghufenxiang from '@/views/modules/dictionaryYonghufenxiang/list'
    import dictionaryYonghufenxiangCollection from '@/views/modules/dictionaryYonghufenxiangCollection/list'
    import dictionaryYonghufenxiangYesno from '@/views/modules/dictionaryYonghufenxiangYesno/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXinwen',
        name: '新闻类别',
        component: dictionaryXinwen
    }
    ,{
        path: '/dictionaryXinwenCollection',
        name: '收藏表类型',
        component: dictionaryXinwenCollection
    }
    ,{
        path: '/dictionaryYonghufenxiang',
        name: '分享类别',
        component: dictionaryYonghufenxiang
    }
    ,{
        path: '/dictionaryYonghufenxiangCollection',
        name: '收藏表类型',
        component: dictionaryYonghufenxiangCollection
    }
    ,{
        path: '/dictionaryYonghufenxiangYesno',
        name: '审核状态',
        component: dictionaryYonghufenxiangYesno
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/xinwen',
        name: '新闻信息',
        component: xinwen
      }
    ,{
        path: '/xinwenCollection',
        name: '新闻收藏',
        component: xinwenCollection
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yonghufenxiang',
        name: '用户分享',
        component: yonghufenxiang
      }
    ,{
        path: '/yonghufenxiangCollection',
        name: '用户分享收藏',
        component: yonghufenxiangCollection
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
