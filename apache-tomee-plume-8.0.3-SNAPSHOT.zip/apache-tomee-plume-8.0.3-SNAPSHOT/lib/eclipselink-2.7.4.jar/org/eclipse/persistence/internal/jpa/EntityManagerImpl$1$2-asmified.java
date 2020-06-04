package asm.org.eclipse.persistence.internal.jpa;
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
public class EntityManagerImpl$1$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$2", null, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$PropertyProcessor", null);

classWriter.visitOuterClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$2", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$PropertyProcessor", "org/eclipse/persistence/internal/jpa/EntityManagerImpl", "PropertyProcessor", ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$2", "this$1", "Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$PropertyProcessor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "process", "(Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/EntityManagerImpl", "getPropertiesHandlerProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/config/ReferenceMode", "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/config/ReferenceMode;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/EntityManagerImpl", "referenceMode", "Lorg/eclipse/persistence/config/ReferenceMode;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl", "hasActivePersistenceContext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/EntityManagerImpl", "extendedPersistenceContext", "Lorg/eclipse/persistence/internal/sessions/RepeatableWriteUnitOfWork;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("properties");
methodVisitor.visitLdcInsn("entity_manager_sets_property_while_context_is_active");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/RepeatableWriteUnitOfWork", "log", "(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
