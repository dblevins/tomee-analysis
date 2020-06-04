package asm.org.apache.safeguard.impl.cdi;
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
public class SafeguardEnabled$LiteralDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal", "Ljavax/enterprise/util/AnnotationLiteral<Lorg/apache/safeguard/impl/cdi/SafeguardEnabled;>;Lorg/apache/safeguard/impl/cdi/SafeguardEnabled;", "javax/enterprise/util/AnnotationLiteral", new String[] { "org/apache/safeguard/impl/cdi/SafeguardEnabled" });

classWriter.visitInnerClass("org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal", "org/apache/safeguard/impl/cdi/SafeguardEnabled", "Literal", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/safeguard/impl/cdi/SafeguardEnabled$Literal;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/util/AnnotationLiteral", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/safeguard/impl/cdi/SafeguardEnabled$Literal", "INSTANCE", "Lorg/apache/safeguard/impl/cdi/SafeguardEnabled$Literal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
