package asm.org.eclipse.persistence.config;
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
public class PersistenceUnitProperties$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "Ljava/util/HashSet<Ljava/lang/String;>;", "java/util/HashSet", null);

classWriter.visitOuterClass("org/eclipse/persistence/config/PersistenceUnitProperties", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/config/PersistenceUnitProperties$1", null, null, 0);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.transaction.join-existing");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.reference-mode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.flush-mode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.close-on-commit");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.persist-on-commit");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.commit-without-persist-rules");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.validate-existence");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.order-updates");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.flush-clear.cache");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/PersistenceUnitProperties$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
