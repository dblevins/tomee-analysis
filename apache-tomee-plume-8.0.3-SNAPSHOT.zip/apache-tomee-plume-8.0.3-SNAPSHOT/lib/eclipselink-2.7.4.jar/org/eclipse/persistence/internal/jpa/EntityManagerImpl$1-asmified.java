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
public class EntityManagerImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", null, "java/util/HashMap", null);

classWriter.visitOuterClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$10", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$11", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$12", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$13", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$14", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$2", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$3", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$4", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$5", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$6", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$7", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$8", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$9", null, null, 0);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.transaction.join-existing");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$1", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.reference-mode");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$2", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.flush-mode");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$3", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.close-on-commit");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$4", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.persist-on-commit");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$5", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.commit-without-persist-rules");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$6", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.validate-existence");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$7", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.order-updates");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$8", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.commit-order");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$9", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.flush-clear.cache");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$10", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.cache.storeMode");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$11", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$12", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.jdbc.exclusive-connection.mode");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.jdbc.exclusive-connection.is-lazy");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.jtaDataSource");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.nonJtaDataSource");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.jdbc.driver");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.jdbc.url");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.jdbc.user");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.jdbc.password");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.jdbc.connection-policy");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.oracle.proxy-type");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$13", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.composite-unit.properties");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$14");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1$14", "<init>", "(Lorg/eclipse/persistence/internal/jpa/EntityManagerImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/EntityManagerImpl$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
