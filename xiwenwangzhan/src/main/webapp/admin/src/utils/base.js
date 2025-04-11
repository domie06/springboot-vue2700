const base = {
    get() {
        return {
            url : "http://localhost:8080/xiwenwangzhan/",
            name: "xiwenwangzhan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiwenwangzhan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新闻网站"
        } 
    }
}
export default base
