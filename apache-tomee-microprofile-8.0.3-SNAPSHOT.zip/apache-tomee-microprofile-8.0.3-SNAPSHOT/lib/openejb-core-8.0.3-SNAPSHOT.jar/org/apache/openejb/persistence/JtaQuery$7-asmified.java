package asm.org.apache.openejb.persistence;
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
public class JtaQuery$7Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/persistence/JtaQuery$7", null, "java/lang/Object", new String[] { "org/apache/openejb/persistence/QueryOperation" });

classWriter.visitOuterClass("org/apache/openejb/persistence/JtaQuery", "setParameter", "(Ljava/lang/String;Ljava/util/Calendar;Ljakarta/persistence/TemporalType;)Ljakarta/persistence/Query;");

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaQuery$7", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$s", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$calendar", "Ljava/util/Calendar;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$temporalType", "Ljakarta/persistence/TemporalType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/persistence/JtaQuery;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/persistence/JtaQuery;Ljava/lang/String;Ljava/util/Calendar;Ljakarta/persistence/TemporalType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/persistence/JtaQuery$7", "this$0", "Lorg/apache/openejb/persistence/JtaQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/persistence/JtaQuery$7", "val$s", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/persistence/JtaQuery$7", "val$calendar", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/persistence/JtaQuery$7", "val$temporalType", "Ljakarta/persistence/TemporalType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljakarta/persistence/Query;)Ljakarta/persistence/Query;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/JtaQuery$7", "val$s", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/JtaQuery$7", "val$calendar", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/persistence/JtaQuery$7", "val$temporalType", "Ljakarta/persistence/TemporalType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/Query", "setParameter", "(Ljava/lang/String;Ljava/util/Calendar;Ljakarta/persistence/TemporalType;)Ljakarta/persistence/Query;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
