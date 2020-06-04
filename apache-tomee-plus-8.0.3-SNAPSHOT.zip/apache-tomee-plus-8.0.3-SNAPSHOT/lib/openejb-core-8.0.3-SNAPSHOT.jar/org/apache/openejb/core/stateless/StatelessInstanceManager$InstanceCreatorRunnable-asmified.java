package asm.org.apache.openejb.core.stateless;
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
public class StatelessInstanceManager$InstanceCreatorRunnableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "org/apache/openejb/core/stateless/StatelessInstanceManager", "Data", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier", "org/apache/openejb/core/stateless/StatelessInstanceManager", "StatelessSupplier", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "org/apache/openejb/core/stateless/StatelessInstanceManager", "InstanceCreatorRunnable", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessInstanceManager$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "maxAge", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iteration", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "maxAgeOffset", "D", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "min", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "data", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "supplier", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager;JJJDLorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;Lorg/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "this$0", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "maxAge", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "iteration", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "min", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(DLOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "maxAgeOffset", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "data", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "supplier", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "supplier", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier", "create", "()Lorg/apache/openejb/core/stateless/Instance;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "maxAge", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "maxAge", "J");
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "maxAgeOffset", "D");
methodVisitor.visitInsn(DDIV);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "min", "J");
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "iteration", "J");
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(D2L);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "maxAge", "J");
methodVisitor.visitInsn(LREM);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/stateless/Instance"}, 0, null);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.LONG});
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "data", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "getPool", "()Lorg/apache/openejb/util/Pool;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "add", "(Ljava/lang/Object;J)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager;JJJDLorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;Lorg/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier;Lorg/apache/openejb/core/stateless/StatelessInstanceManager$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(DLOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/stateless/StatelessInstanceManager$InstanceCreatorRunnable", "<init>", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager;JJJDLorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;Lorg/apache/openejb/core/stateless/StatelessInstanceManager$StatelessSupplier;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(12, 13);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
