package asm.org.apache.openjpa.jdbc.kernel.exps;
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
public class QueryExpressionsStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_STATES", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "projections", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "filter", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "grouping", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "having", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "ordering", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "EMPTY_STATES", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "projections", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "filter", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "EMPTY_STATES", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "grouping", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "having", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "EMPTY_STATES", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "ordering", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/jdbc/kernel/exps/ExpState");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState", "EMPTY_STATES", "[Lorg/apache/openjpa/jdbc/kernel/exps/ExpState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
