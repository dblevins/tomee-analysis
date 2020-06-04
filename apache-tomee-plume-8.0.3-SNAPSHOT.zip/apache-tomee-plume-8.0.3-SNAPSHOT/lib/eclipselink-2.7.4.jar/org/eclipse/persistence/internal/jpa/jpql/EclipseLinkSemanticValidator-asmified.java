package asm.org.eclipse.persistence.internal.jpa.jpql;
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
public class EclipseLinkSemanticValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/jpa/jpql/EclipseLinkSemanticValidator", null, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator", null);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/jpql/EclipseLinkSemanticValidatorHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/jpql/EclipseLinkSemanticValidatorHelper", "<init>", "(Lorg/eclipse/persistence/internal/jpa/jpql/JPQLQueryContext;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/EclipseLinkSemanticValidatorExtension", "NULL_EXTENSION", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkSemanticValidatorExtension;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/SemanticValidatorHelper;Lorg/eclipse/persistence/jpa/jpql/EclipseLinkSemanticValidatorExtension;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
