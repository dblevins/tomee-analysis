package asm.org.apache.myfaces.shared.webapp.webxml;
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
public class WebXmlParser$_EntityResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser$_EntityResolver", null, "java/lang/Object", new String[] { "org/xml/sax/EntityResolver" });

classWriter.visitInnerClass("org/apache/myfaces/shared/webapp/webxml/WebXmlParser$_EntityResolver", "org/apache/myfaces/shared/webapp/webxml/WebXmlParser", "_EntityResolver", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/myfaces/shared/webapp/webxml/WebXmlParser$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser$_EntityResolver", "this$0", "Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolveEntity", "(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("systemId must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("http://java.sun.com/dtd/web-app_2_2.dtd");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("http://java.sun.com/j2ee/dtds/web-app_2_2.dtd");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser$_EntityResolver", "this$0", "Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javax/servlet/resources/web-app_2_2.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser", "access$100", "(Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("http://java.sun.com/dtd/web-app_2_3.dtd");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser$_EntityResolver", "this$0", "Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javax/servlet/resources/web-app_2_3.dtd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser", "access$100", "(Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser$_EntityResolver", "this$0", "Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser", "access$200", "(Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/webapp/webxml/WebXmlParser$_EntityResolver", "<init>", "(Lorg/apache/myfaces/shared/webapp/webxml/WebXmlParser;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
