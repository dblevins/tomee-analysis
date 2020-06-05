package asm.org.apache.tomcat.util.descriptor;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class DigesterFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/descriptor/DigesterFactory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLASS_SERVLET_CONTEXT", "Ljava/lang/Class;", "Ljava/lang/Class<Ljakarta/servlet/ServletContext;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLASS_JSP_CONTEXT", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_API_PUBLIC_IDS", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_API_SYSTEM_IDS", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("https://");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "CLASS_SERVLET_CONTEXT", "Ljava/lang/Class;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("resources/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "CLASS_JSP_CONTEXT", "Ljava/lang/Class;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "CLASS_JSP_CONTEXT", "Ljava/lang/Class;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("resources/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/net/URL"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/descriptor/DigesterFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("digesterFactory.missingSchema");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newDigester", "(ZZLorg/apache/tomcat/util/digester/RuleSet;Z)Lorg/apache/tomcat/util/digester/Digester;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/digester/Digester");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/digester/Digester", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "setNamespaceAware", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "setValidating", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "setUseContextClassLoader", "(Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/LocalResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "SERVLET_API_PUBLIC_IDS", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "SERVLET_API_SYSTEM_IDS", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/LocalResolver", "<init>", "(Ljava/util/Map;Ljava/util/Map;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRuleSet", "(Lorg/apache/tomcat/util/digester/RuleSet;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/tomcat/util/digester/Digester", "org/xml/sax/ext/EntityResolver2"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/Constants", "PACKAGE_NAME", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/String;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/servlet/ServletContext;"));
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "CLASS_SERVLET_CONTEXT", "Ljava/lang/Class;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("jakarta.servlet.jsp.JspContext");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/lang/Class"}, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "CLASS_JSP_CONTEXT", "Ljava/lang/Class;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("-//W3C//DTD XMLSCHEMA 200102//EN");
methodVisitor.visitLdcInsn("XMLSchema.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("datatypes");
methodVisitor.visitLdcInsn("datatypes.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/xml.xsd");
methodVisitor.visitLdcInsn("xml.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("-//Sun Microsystems, Inc.//DTD Web Application 2.2//EN");
methodVisitor.visitLdcInsn("web-app_2_2.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN");
methodVisitor.visitLdcInsn("web-jsptaglibrary_1_1.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN");
methodVisitor.visitLdcInsn("web-app_2_3.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.2//EN");
methodVisitor.visitLdcInsn("web-jsptaglibrary_1_2.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://www.ibm.com/webservices/xsd/j2ee_web_services_1_1.xsd");
methodVisitor.visitLdcInsn("j2ee_web_services_1_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://www.ibm.com/webservices/xsd/j2ee_web_services_client_1_1.xsd");
methodVisitor.visitLdcInsn("j2ee_web_services_client_1_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd");
methodVisitor.visitLdcInsn("web-app_2_4.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd");
methodVisitor.visitLdcInsn("web-jsptaglibrary_2_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("j2ee_1_4.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jsp_2_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd");
methodVisitor.visitLdcInsn("web-app_2_5.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd");
methodVisitor.visitLdcInsn("web-jsptaglibrary_2_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_5.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jsp_2_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_web_services_1_2.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_web_services_client_1_2.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd");
methodVisitor.visitLdcInsn("web-app_3_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee/web-fragment_3_0.xsd");
methodVisitor.visitLdcInsn("web-fragment_3_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("web-common_3_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_6.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jsp_2_2.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_web_services_1_3.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_web_services_client_1_3.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
methodVisitor.visitLdcInsn("web-app_3_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/xml/ns/javaee/web-fragment_3_1.xsd");
methodVisitor.visitLdcInsn("web-fragment_3_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("web-common_3_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_7.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jsp_2_3.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_web_services_1_4.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_web_services_client_1_4.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd");
methodVisitor.visitLdcInsn("web-app_4_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/xml/ns/javaee/web-fragment_4_0.xsd");
methodVisitor.visitLdcInsn("web-fragment_4_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "locationFor", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "add", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("web-common_4_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javaee_8.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "addSelf", "(Ljava/util/Map;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "SERVLET_API_PUBLIC_IDS", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "SERVLET_API_SYSTEM_IDS", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}