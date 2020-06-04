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
public class PropertiesHandler$ReferenceModePropDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/PropertiesHandler$ReferenceModeProp", null, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "Prop", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/PropertiesHandler$ReferenceModeProp", "org/eclipse/persistence/internal/sessions/PropertiesHandler", "ReferenceModeProp", ACC_PROTECTED | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("eclipselink.persistence-context.reference-mode");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/config/ReferenceMode", "HARD", "Lorg/eclipse/persistence/config/ReferenceMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/ReferenceMode", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/PropertiesHandler$Prop", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/config/ReferenceMode", "HARD", "Lorg/eclipse/persistence/config/ReferenceMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/ReferenceMode", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/config/ReferenceMode", "WEAK", "Lorg/eclipse/persistence/config/ReferenceMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/ReferenceMode", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/config/ReferenceMode", "FORCE_WEAK", "Lorg/eclipse/persistence/config/ReferenceMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/config/ReferenceMode", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/PropertiesHandler$ReferenceModeProp", "valueArray", "[Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
