package asm.org.apache.myfaces.cdi.managedproperty;
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
public class ManagedPropertyProducer$ManagedPropertyAnnotationLiteralDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral", "Ljakarta/enterprise/util/AnnotationLiteral<Ljakarta/faces/annotation/ManagedProperty;>;Ljakarta/faces/annotation/ManagedProperty;", "jakarta/enterprise/util/AnnotationLiteral", new String[] { "jakarta/faces/annotation/ManagedProperty" });

classWriter.visitInnerClass("org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral", "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer", "ManagedPropertyAnnotationLiteral", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral", "this$0", "Lorg/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/util/AnnotationLiteral", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/cdi/managedproperty/ManagedPropertyProducer$ManagedPropertyAnnotationLiteral", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
