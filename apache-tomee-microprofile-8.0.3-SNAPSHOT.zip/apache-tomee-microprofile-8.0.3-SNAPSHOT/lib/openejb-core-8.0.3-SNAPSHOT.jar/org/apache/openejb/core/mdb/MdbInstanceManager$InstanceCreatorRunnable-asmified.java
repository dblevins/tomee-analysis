package asm.org.apache.openejb.core.mdb;
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
public class MdbInstanceManager$InstanceCreatorRunnableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/openejb/core/mdb/MdbInstanceManager$Data", "org/apache/openejb/core/mdb/MdbInstanceManager", "Data", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier", "org/apache/openejb/core/mdb/MdbInstanceManager", "InstanceSupplier", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "org/apache/openejb/core/mdb/MdbInstanceManager", "InstanceCreatorRunnable", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "data", "Lorg/apache/openejb/core/mdb/MdbInstanceManager$Data;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "supplier", "Lorg/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "offset", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/mdb/MdbInstanceManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/core/mdb/MdbInstanceManager;JJJDLorg/apache/openejb/core/mdb/MdbInstanceManager$Data;Lorg/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "this$0", "Lorg/apache/openejb/core/mdb/MdbInstanceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "data", "Lorg/apache/openejb/core/mdb/MdbInstanceManager$Data;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "supplier", "Lorg/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(DLOAD, 8);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(D2L);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LREM);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "org/apache/openejb/core/mdb/MdbInstanceManager", Opcodes.LONG, Opcodes.LONG, Opcodes.LONG, Opcodes.DOUBLE, "org/apache/openejb/core/mdb/MdbInstanceManager$Data", "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier"}, 1, new Object[] {"org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable"});
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "org/apache/openejb/core/mdb/MdbInstanceManager", Opcodes.LONG, Opcodes.LONG, Opcodes.LONG, Opcodes.DOUBLE, "org/apache/openejb/core/mdb/MdbInstanceManager$Data", "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier"}, 2, new Object[] {"org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", Opcodes.LONG});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "offset", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "supplier", "Lorg/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceSupplier", "create", "()Lorg/apache/openejb/core/mdb/Instance;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "data", "Lorg/apache/openejb/core/mdb/MdbInstanceManager$Data;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/mdb/MdbInstanceManager$Data", "getPool", "()Lorg/apache/openejb/util/Pool;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/mdb/MdbInstanceManager$InstanceCreatorRunnable", "offset", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "add", "(Ljava/lang/Object;J)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/mdb/Instance"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
