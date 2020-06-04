package asm.org.apache.openjpa.lib.util;
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
public class ReferenceHashMap$AccessibleEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", null, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceEntry", null);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractHashedMap$HashEntry", "org/apache/commons/collections4/map/AbstractHashedMap", "HashEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "org/apache/openjpa/lib/util/ReferenceHashMap", "AccessibleEntry", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceEntry", "org/apache/commons/collections4/map/AbstractReferenceMap", "ReferenceEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "org/apache/commons/collections4/map/AbstractReferenceMap", "ReferenceStrength", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parent", "Lorg/apache/openjpa/lib/util/ReferenceHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections4/map/AbstractReferenceMap;Lorg/apache/commons/collections4/map/AbstractHashedMap$HashEntry;ILjava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceEntry", "<init>", "(Lorg/apache/commons/collections4/map/AbstractReferenceMap;Lorg/apache/commons/collections4/map/AbstractHashedMap$HashEntry;ILjava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/lib/util/ReferenceHashMap");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "parent", "Lorg/apache/openjpa/lib/util/ReferenceHashMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "key", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "key", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextEntry", "()Lorg/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "next", "Lorg/apache/commons/collections4/map/AbstractHashedMap$HashEntry;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNextEntry", "(Lorg/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "next", "Lorg/apache/commons/collections4/map/AbstractHashedMap$HashEntry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "onPurge", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "parent", "Lorg/apache/openjpa/lib/util/ReferenceHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "HARD", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/ReferenceHashMap", "access$000", "(Lorg/apache/openjpa/lib/util/ReferenceHashMap;Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "parent", "Lorg/apache/openjpa/lib/util/ReferenceHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "key", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/ReferenceHashMap", "valueExpired", "(Ljava/lang/Object;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "parent", "Lorg/apache/openjpa/lib/util/ReferenceHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength", "HARD", "Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/ReferenceHashMap", "access$100", "(Lorg/apache/openjpa/lib/util/ReferenceHashMap;Lorg/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "parent", "Lorg/apache/openjpa/lib/util/ReferenceHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/ReferenceHashMap$AccessibleEntry", "value", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/ReferenceHashMap", "keyExpired", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
