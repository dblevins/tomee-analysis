package asm.org.apache.myfaces.spi.impl;
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
public class ServletMappingImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/spi/impl/ServletMappingImpl", null, "java/lang/Object", new String[] { "org/apache/myfaces/spi/ServletMapping" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/spi/impl/ServletMappingImpl", "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isExtensionMapping", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/ServletMappingImpl", "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared_impl/webapp/webxml/ServletMapping", "isExtensionMapping", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExtension", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/ServletMappingImpl", "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared_impl/webapp/webxml/ServletMapping", "getExtension", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/ServletMappingImpl", "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared_impl/webapp/webxml/ServletMapping", "getPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServletName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/ServletMappingImpl", "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared_impl/webapp/webxml/ServletMapping", "getServletName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServletClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/ServletMappingImpl", "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared_impl/webapp/webxml/ServletMapping", "getServletClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUrlPattern", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/impl/ServletMappingImpl", "_delegateMapping", "Lorg/apache/myfaces/shared_impl/webapp/webxml/ServletMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared_impl/webapp/webxml/ServletMapping", "getUrlPattern", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
