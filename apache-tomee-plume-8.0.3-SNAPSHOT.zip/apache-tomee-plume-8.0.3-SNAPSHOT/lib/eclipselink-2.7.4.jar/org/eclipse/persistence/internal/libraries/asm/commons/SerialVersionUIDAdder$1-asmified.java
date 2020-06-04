package asm.org.eclipse.persistence.internal.libraries.asm.commons;
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
public class SerialVersionUIDAdder$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$1", "Ljava/lang/Object;Ljava/util/Comparator<Lorg/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item;>;", "java/lang/Object", new String[] { "java/util/Comparator" });

classWriter.visitOuterClass("org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder", "writeItems", "(Ljava/util/Collection;Ljava/io/DataOutput;Z)V");

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item", "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder", "Item", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item;Lorg/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "compareTo", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item", "descriptor", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item", "descriptor", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "compareTo", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$1", "compare", "(Lorg/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item;Lorg/eclipse/persistence/internal/libraries/asm/commons/SerialVersionUIDAdder$Item;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
