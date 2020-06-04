package asm.javax.persistence.criteria;
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
public class SetJoinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/SetJoin", "<Z:Ljava/lang/Object;E:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/PluralJoin<TZ;Ljava/util/Set<TE;>;TE;>;", "java/lang/Object", new String[] { "javax/persistence/criteria/PluralJoin" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/SetJoin;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/SetJoin<TZ;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/SetJoin;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/SetJoin<TZ;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getModel", "()Ljavax/persistence/metamodel/SetAttribute;", "()Ljavax/persistence/metamodel/SetAttribute<-TZ;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_VARARGS | ACC_SYNTHETIC, "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/SetJoin", "on", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/SetJoin;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Join;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/SetJoin", "on", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/SetJoin;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/Bindable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/SetJoin", "getModel", "()Ljavax/persistence/metamodel/SetAttribute;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getModel", "()Ljavax/persistence/metamodel/PluralAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/SetJoin", "getModel", "()Ljavax/persistence/metamodel/SetAttribute;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
