package asm.org.eclipse.persistence.annotations;
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
public class TransientCompatibleAnnotations$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", "Ljava/util/ArrayList<Ljava/lang/String;>;", "java/util/ArrayList", null);

classWriter.visitOuterClass("org/eclipse/persistence/annotations/TransientCompatibleAnnotations", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", null, null, 0);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.PersistenceUnits");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.PersistenceUnit");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.PersistenceContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.PersistenceContexts");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.Access");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.persistence.Transient");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/TransientCompatibleAnnotations$1", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
