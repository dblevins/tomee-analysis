package asm.org.eclipse.persistence.jpa.jpql;
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
public class AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", null, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$TopLevelFirstDeclarationVisitor", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator", "TopLevelFirstDeclarationVisitor", ACC_PROTECTED | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$TopLevelFirstDeclarationVisitor", "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator", "TopLevelFirstDeclarationVisitor", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractSemanticValidator$TopLevelFirstDeclarationVisitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/eclipse/persistence/jpa/jpql/parser/CollectionValuedPathExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator", "getProviderVersion", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jpa/jpql/EclipseLinkVersion", "value", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/EclipseLinkVersion", "VERSION_2_4", "Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/EclipseLinkVersion", "isNewerThanOrEqual", "(Lorg/eclipse/persistence/jpa/jpql/EclipseLinkVersion;)Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "valid", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "valid", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator", "helper", "Lorg/eclipse/persistence/jpa/jpql/SemanticValidatorHelper;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/parser/CollectionValuedPathExpression", "toActualText", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/SemanticValidatorHelper", "getType", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "validator", "Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator", "helper", "Lorg/eclipse/persistence/jpa/jpql/SemanticValidatorHelper;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jpa/jpql/SemanticValidatorHelper", "isTypeResolvable", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "valid", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/jpa/jpql/EclipseLinkVersion"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator$TopLevelFirstDeclarationVisitor", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/AbstractEclipseLinkSemanticValidator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
