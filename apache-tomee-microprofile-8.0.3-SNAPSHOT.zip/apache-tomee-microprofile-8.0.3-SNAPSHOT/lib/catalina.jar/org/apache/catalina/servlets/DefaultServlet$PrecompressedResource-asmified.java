package asm.org.apache.catalina.servlets;
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
public class DefaultServlet$PrecompressedResourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/catalina/servlets/DefaultServlet$PrecompressedResource", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/catalina/servlets/DefaultServlet$CompressionFormat", "org/apache/catalina/servlets/DefaultServlet", "CompressionFormat", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/servlets/DefaultServlet$PrecompressedResource", "org/apache/catalina/servlets/DefaultServlet", "PrecompressedResource", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/servlets/DefaultServlet$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "resource", "Lorg/apache/catalina/WebResource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "format", "Lorg/apache/catalina/servlets/DefaultServlet$CompressionFormat;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/catalina/WebResource;Lorg/apache/catalina/servlets/DefaultServlet$CompressionFormat;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/servlets/DefaultServlet$PrecompressedResource", "resource", "Lorg/apache/catalina/WebResource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/servlets/DefaultServlet$PrecompressedResource", "format", "Lorg/apache/catalina/servlets/DefaultServlet$CompressionFormat;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/catalina/WebResource;Lorg/apache/catalina/servlets/DefaultServlet$CompressionFormat;Lorg/apache/catalina/servlets/DefaultServlet$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/servlets/DefaultServlet$PrecompressedResource", "<init>", "(Lorg/apache/catalina/WebResource;Lorg/apache/catalina/servlets/DefaultServlet$CompressionFormat;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
