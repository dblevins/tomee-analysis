package asm.org.apache.tomcat.jdbc.pool.interceptor;
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
public class SlowQueryReport$QueryStatsComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStatsComparator", "Ljava/lang/Object;Ljava/util/Comparator<Lorg/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats;>;", "java/lang/Object", new String[] { "java/util/Comparator" });

classWriter.visitInnerClass("org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStatsComparator", "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport", "QueryStatsComparator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats", "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport", "QueryStats", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats;Lorg/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats", "access$000", "(Lorg/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats;)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStatsComparator", "handleZero", "(J)J", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats", "access$000", "(Lorg/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats;)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStatsComparator", "handleZero", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "compare", "(JJ)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "handleZero", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.LONG});
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStatsComparator", "compare", "(Lorg/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats;Lorg/apache/tomcat/jdbc/pool/interceptor/SlowQueryReport$QueryStats;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
