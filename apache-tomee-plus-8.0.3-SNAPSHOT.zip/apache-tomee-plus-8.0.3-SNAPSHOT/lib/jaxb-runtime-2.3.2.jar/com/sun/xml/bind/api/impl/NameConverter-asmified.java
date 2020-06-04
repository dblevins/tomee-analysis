package asm.com.sun.xml.bind.api.impl;
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
public class NameConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/api/impl/NameConverter", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/xml/bind/api/impl/NameConverter$Standard", "com/sun/xml/bind/api/impl/NameConverter", "Standard", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/api/impl/NameConverter$2", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/api/impl/NameConverter$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "standard", "Lcom/sun/xml/bind/api/impl/NameConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "jaxrpcCompatible", "Lcom/sun/xml/bind/api/impl/NameConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "smart", "Lcom/sun/xml/bind/api/impl/NameConverter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toClassName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toInterfaceName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toPropertyName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toConstantName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toVariableName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toPackageName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/api/impl/NameConverter$Standard");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/impl/NameConverter$Standard", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/api/impl/NameConverter", "standard", "Lcom/sun/xml/bind/api/impl/NameConverter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/api/impl/NameConverter$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/impl/NameConverter$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/api/impl/NameConverter", "jaxrpcCompatible", "Lcom/sun/xml/bind/api/impl/NameConverter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/api/impl/NameConverter$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/impl/NameConverter$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/api/impl/NameConverter", "smart", "Lcom/sun/xml/bind/api/impl/NameConverter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
