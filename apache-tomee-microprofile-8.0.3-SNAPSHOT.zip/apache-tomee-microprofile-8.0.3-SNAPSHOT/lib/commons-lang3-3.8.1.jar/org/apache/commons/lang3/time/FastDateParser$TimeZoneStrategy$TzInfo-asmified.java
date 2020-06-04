package asm.org.apache.commons.lang3.time;
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
public class FastDateParser$TimeZoneStrategy$TzInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy", "org/apache/commons/lang3/time/FastDateParser", "TimeZoneStrategy", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo", "org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy", "TzInfo", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "zone", "Ljava/util/TimeZone;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "dstOffset", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/util/TimeZone;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo", "zone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/TimeZone", "getDSTSavings", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo", "java/util/TimeZone", Opcodes.INTEGER}, 1, new Object[] {"org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo", "java/util/TimeZone", Opcodes.INTEGER}, 2, new Object[] {"org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDateParser$TimeZoneStrategy$TzInfo", "dstOffset", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
