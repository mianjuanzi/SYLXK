
$(function () {
    InitLeftMenu(); 
})

function InitLeftMenu() {
	
	
    $("#nav").accordion({ animate: false });

    $.each(home_menus, function (i) {
        var n = home_menus[i];
        var menulist = '';
        menulist += '<ul>';
        $.each(n.menus, function (j, o) {	
			menulist += '<li><div><a target="mainFrame" href="'+o.url + '" ><span class="icon ' + o.icon + '" >&nbsp;</span><span class="nav">' + o.menuname + '</span></a></div></li> ';
			
			
			
        });
        menulist += '</ul>';

        $('#nav').accordion('add', {
            title: n.menuname,
            content: menulist,
            iconCls: 'icon ' + n.icon
        });
    });
	
	
	$('.easyui-accordion li a').click(function () {
        var tabTitle = $(this).text();
        var url = $(this).attr("href");
        addTab(tabTitle, url);
        $('.easyui-accordion li div').removeClass("selected");
        $(this).parent().addClass("selected");
    }).hover(function () {
        $(this).parent().addClass("hover");
    }, function () {
        $(this).parent().removeClass("hover");
    });
	
	
    
    //选中第一个
    var panels = $('#nav').accordion('panels');
    if (panels.length > 0) {
        var t = panels[0].panel('options').title;
        $('#nav').accordion('select', t);
    }
}




function addTab(subtitle, url) {
    if (!$('#tabs').tabs('exists', subtitle)) {
        $('#tabs').tabs('add', {
            title: subtitle,
            content: createFrame(url),
            closable: true
        });
    } else {
        $('#tabs').tabs('select', subtitle);
    }
}

function createFrame(url) {
    var s = '<iframe name="mainFrame" scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
    return s;
}



