<%@page contentType="text/html; charset=utf-8" %>
<%@page import="jp.itacademy.sample.web.mvc.counter.Counter" %>
<% Counter counter=(Counter)session.getAttribute("counter"); %>

<!DOCTYPE html>

<meta charset="utf-8">
<title>カウンター</title>

<p>訪問回数：<%=counter.getNum() %>　回</p>
