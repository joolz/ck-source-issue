# ck-source-issue

POC to demonstrate a ckeditor issue when using the source mode in Liferay 7.2

## Steps to reproduce

- setup a vanilla Liferay DXP 7.2 (EE edition) with fixpack dxp-9
- build this project and deploy it on Liferay, place the portlet sample/cktest on a page

Now, you can reproduce the issue like this

- the editor has the initial value "initial value". Change it to "something else" and click the link "Post the form"
- in catalina.out, "something else" is logged. This is the expected scenario
- now, the bug: refresh the page. Again, the editor has the initial value "initial value". **Set the editor to source mode** and change the content to "presto!" and click the link "Post the form"
- expected behaviour: in catalina.out "presto!" is logged. Actual behaviour: "initial value" is logged

After editing in source mode and switching back to "UI-mode" without further editing of the conten, it also goes wrong. When editing in source mode, switching back to UI-mode, and do some more editing, the last edit **is** retained, but this is hardly a valid workaround.