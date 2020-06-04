package asm.org.eclipse.persistence.sdo;
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
public class SDOType$TypeInstantiationPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/SDOType$TypeInstantiationPolicy", null, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", null);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/SDOType$TypeInstantiationPolicy", "org/eclipse/persistence/sdo/SDOType", "TypeInstantiationPolicy", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "sdoType", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/sdo/SDOType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOType$TypeInstantiationPolicy", "sdoType", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildNewInstance", "()Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOType$TypeInstantiationPolicy", "sdoType", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOType", "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getDataFactory", "()Lcommonj/sdo/helper/DataFactory;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOType$TypeInstantiationPolicy", "sdoType", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/DataFactory", "create", "(Lcommonj/sdo/Type;)Lcommonj/sdo/DataObject;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
