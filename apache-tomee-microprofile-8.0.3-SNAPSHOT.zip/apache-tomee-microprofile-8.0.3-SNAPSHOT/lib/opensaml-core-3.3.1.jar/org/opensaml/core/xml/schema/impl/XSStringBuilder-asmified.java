package asm.org.opensaml.core.xml.schema.impl;
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
public class XSStringBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/core/xml/schema/impl/XSStringBuilder", "Lorg/opensaml/core/xml/AbstractXMLObjectBuilder<Lorg/opensaml/core/xml/schema/XSString;>;", "org/opensaml/core/xml/AbstractXMLObjectBuilder", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/AbstractXMLObjectBuilder", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/core/xml/schema/XSString;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/schema/impl/XSStringImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/schema/impl/XSStringImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/core/xml/XMLObject;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/schema/impl/XSStringBuilder", "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/core/xml/schema/XSString;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
