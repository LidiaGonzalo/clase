package com.ipartek.formacion.controller;

import com.ipartek.formacion.pojo.DuracionModulo;

public class Constantes {
	private Constantes() {}
	
	
	public final static String ATT_LISTADO_CURSOS= "listado_cursos";
	public final static String ATT_CURSO = "curso";
	
	public final static String ATT_LISTADO_ALUMNOS ="listado_alumnos";
	public final static String ATT_ALUMNO ="alumno";

	public final static String ATT_USUARIO="usuario";//ServletFilter
	public final static String ATT_LIST_USUARIOS="listado_usuarios";//SessionListener
	
	public final static String ATT_LISTADO_MODULOS = "listado_modulos";
	public final static String ATT_MODULO = "modulo";
	public final static String ATT_LISTA_DURACION_MODULO="listado_duracion";
	public final static String ATT_MENSAJE ="mensaje";
	public final static String ATT_LISTADO_SESIONES ="listado_sesiones";
		
	public final static String PAR_CODIGO= "codigo";
	public final static String PAR_NOMBRE ="nombre";
	public final static String PAR_LISTADO_MODULOS ="codigos_modulos";
	public final static String PAR_LISTADO_ALUMNOS="codigos_alumnos";
	
	public final static String PAR_DNI = "dni";
	public final static String PAR_APELLIDOS = "apellidos";
	public final static String PAR_OPERACION ="operacion";
	//añadir campo fecha a alumnos
	public final static String PAR_MES ="mes";
	public final static String PAR_DIA ="dia";
	public final static String PAR_ANIO ="anio";
	
	
	public final static String SERVLET_CURSOS ="cursos.do";
	public final static String SERVLET_ALUMNOS ="alumnos.do";
	public final static String SERVLET_MODULOS ="modulos.do";
	//LOGIN
	public final static String SERVLET_LOGIN ="login.do";
	//ADMIN
	public final static String SERVLET_ADMINISTRACION ="administracion.do";
	
	public final static DuracionModulo[] LISTA_DURACION = {DuracionModulo.HORAS15,DuracionModulo.HORAS20,DuracionModulo.HORAS45,DuracionModulo.HORAS80,DuracionModulo.HORAS90};
	
	public final static String PAR_GENERO="genero";
	public final static String PAR_IDIOMA ="idioma";
	public final static String PAR_CURSO ="curso";
	//ENUMER
	public final static String PAR_DURACION ="duracion";
	public final static String PAR_TIPOCURSO ="tipo_curso";
	public final static String PAR_REFERENCIA="referencia";
	//cookie
	public final static String PAR_RECORDAR="recordar";

	public final static String PAR_USERNAME ="username";
	public final static String PAR_PASSWORD ="password";
	//session id
	public final static String PAR_SESSIONID ="sessionid";
	
	
	public final static String JSP_LISTADO_CURSOS ="/cursos/listado.jsp";
	public final static String JSP_CURSO ="/cursos/curso.jsp";
	
	public final static String JSP_LISTADO_ALUMNOS ="/alumnos/listado.jsp";
	public final static String JSP_ALUMNO ="/alumnos/alumno.jsp";
	
	public final static String JSP_LISTADO_MODULOS ="/modulos/listado.jsp";
	public final static String JSP_MODULO ="/modulos/modulo.jsp";
	//opción admin de la barra de navegación
	public final static String JSP_LISTADO_USUARIOS ="/administracion/listado-usuarios.jsp";
	public final static String JSP_HOME ="index.jsp";
	public final static int OP_CREATE = 0;
	public final static int OP_READ = 1;
	public final static int OP_UPDATE = 2;
	public final static int OP_DELETE = 3;
}
