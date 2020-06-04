package asm.org.opensaml.profile.logic;
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
public class MessageContextPredicateAdapterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "Ljava/lang/Object;Lcom/google/common/base/Predicate<Lorg/opensaml/messaging/context/MessageContext;>;", "java/lang/Object", new String[] { "com/google/common/base/Predicate" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "adapted", "Lcom/google/common/base/Predicate;", "Lcom/google/common/base/Predicate<Lorg/opensaml/profile/context/ProfileRequestContext;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "prcLookup", "Lorg/opensaml/messaging/context/navigate/RecursiveTypedParentContextLookup;", "Lorg/opensaml/messaging/context/navigate/RecursiveTypedParentContextLookup<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/profile/context/ProfileRequestContext;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "noPRCSatisfies", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/google/common/base/Predicate;)V", "(Lcom/google/common/base/Predicate<Lorg/opensaml/profile/context/ProfileRequestContext;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/ParameterName;", true);
annotationVisitor0.visit("name", "prcPredicate");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "<init>", "(Lcom/google/common/base/Predicate;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/google/common/base/Predicate;Z)V", "(Lcom/google/common/base/Predicate<Lorg/opensaml/profile/context/ProfileRequestContext;>;Z)V", null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/ParameterName;", true);
annotationVisitor0.visit("name", "prcPredicate");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lnet/shibboleth/utilities/java/support/annotation/ParameterName;", true);
annotationVisitor0.visit("name", "unresolvedSatisfies");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("The adapted predicate may not be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Predicate");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "adapted", "Lcom/google/common/base/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "noPRCSatisfies", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/RecursiveTypedParentContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/profile/context/ProfileRequestContext;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/RecursiveTypedParentContextLookup", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "prcLookup", "Lorg/opensaml/messaging/context/navigate/RecursiveTypedParentContextLookup;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/messaging/context/MessageContext;)Z", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "prcLookup", "Lorg/opensaml/messaging/context/navigate/RecursiveTypedParentContextLookup;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/navigate/RecursiveTypedParentContextLookup", "apply", "(Lorg/opensaml/messaging/context/BaseContext;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/profile/context/ProfileRequestContext");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "noPRCSatisfies", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/profile/context/ProfileRequestContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "adapted", "Lcom/google/common/base/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Predicate", "apply", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/messaging/context/MessageContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/profile/logic/MessageContextPredicateAdapter", "apply", "(Lorg/opensaml/messaging/context/MessageContext;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
