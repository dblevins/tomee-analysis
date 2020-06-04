package asm.org.eclipse.persistence.internal.sessions.factories;
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
public class ObjectPersistenceRuntimeXMLProject_11_1_1$ObjectRelationalDatabaseFieldInstantiationPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$ObjectRelationalDatabaseFieldInstantiationPolicy", null, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1$ObjectRelationalDatabaseFieldInstantiationPolicy", "org/eclipse/persistence/internal/sessions/factories/ObjectPersistenceRuntimeXMLProject_11_1_1", "ObjectRelationalDatabaseFieldInstantiationPolicy", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/descriptors/InstantiationPolicy", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildNewInstance", "()Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DescriptorException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/mappings/structures/ObjectRelationalDatabaseField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/mappings/structures/ObjectRelationalDatabaseField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
