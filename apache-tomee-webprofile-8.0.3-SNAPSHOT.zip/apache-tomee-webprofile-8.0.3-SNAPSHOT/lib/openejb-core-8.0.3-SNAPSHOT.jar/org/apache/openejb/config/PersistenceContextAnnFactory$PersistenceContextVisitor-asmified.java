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
public class PersistenceContextAnnFactory$PersistenceContextVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", null, "org/apache/xbean/asm7/AnnotationVisitor", null);

classWriter.visitInnerClass("org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "org/apache/openejb/config/PersistenceContextAnnFactory", "PersistenceContextVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "org/apache/openejb/config/PersistenceContextAnnFactory", "AsmPersistenceContext", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/PersistenceContextAnnFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "contexts", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(458752));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/AnnotationVisitor", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "<init>", "(Lorg/apache/openejb/config/PersistenceContextAnnFactory$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "contexts", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String", "java/lang/Object"}, 2, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String", "java/lang/Object"}, 3, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "setValue", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnum", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String", "java/lang/String", "java/lang/String"}, 2, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String", "java/lang/String", "java/lang/String"}, 3, new Object[] {"org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "java/lang/String", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "setValue", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/xbean/asm7/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "setValue", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setValue", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "name", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("unitName");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "unitName", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "type", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("synchronization");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "synchronization", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitArray", "(Ljava/lang/String;)Lorg/apache/xbean/asm7/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "<init>", "(Lorg/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor$1", "annotationVisitor", "()Lorg/apache/xbean/asm7/AnnotationVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "contexts", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor;)Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/PersistenceContextAnnFactory$PersistenceContextVisitor", "persistenceContext", "Lorg/apache/openejb/config/PersistenceContextAnnFactory$AsmPersistenceContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
