package asm.org.apache.openejb.config;
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
public class PersistenceContextAnnFactory$PersistenceContextVisitor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", null, "org/apache/xbean/asm7/shade/commons/EmptyVisitor", null);

classWriter.visitOuterClass("org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "visitArray", "(Ljava/lang/String;)Lorg/apache/xbean/asm7/AnnotationVisitor;");

classWriter.visitInnerClass("org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "org/apache/openejb/config/PersistenceContextAnnFactory", "PersistenceContextVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "org/apache/openejb/config/PersistenceContextAnnFactory", "AsmPersistenceContext", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "this$0", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/shade/commons/EmptyVisitor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "java/lang/String", "java/lang/Object"}, 2, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "java/lang/String"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "name", "Ljava/lang/String;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitInsn(ACONST_NULL);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "java/lang/String", "java/lang/Object"}, 2, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "java/lang/String"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "value", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "this$0", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "access$200", "(Lorg/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor;)Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "properties", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "value", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
