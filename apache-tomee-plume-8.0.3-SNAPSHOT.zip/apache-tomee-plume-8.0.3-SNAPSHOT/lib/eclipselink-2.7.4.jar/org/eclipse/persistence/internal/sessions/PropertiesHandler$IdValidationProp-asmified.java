package asm.org.eclipse.persistence.internal.sessions;
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
public class PropertiesHandler$IdValidationPropDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/PropertiesHandler$IdValidationProp", null, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$IdValidationProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "IdValidationProp", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "Prop", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.id-validation");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/annotations/IdValidation", "ZERO", "Lorg/eclipse/persistence/annotations/IdValidation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/IdValidation", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/annotations/IdValidation", "NULL", "Lorg/eclipse/persistence/annotations/IdValidation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/IdValidation", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/annotations/IdValidation", "ZERO", "Lorg/eclipse/persistence/annotations/IdValidation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/IdValidation", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/annotations/IdValidation", "NEGATIVE", "Lorg/eclipse/persistence/annotations/IdValidation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/IdValidation", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/annotations/IdValidation", "NONE", "Lorg/eclipse/persistence/annotations/IdValidation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/annotations/IdValidation", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/PropertiesHandler$IdValidationProp", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
