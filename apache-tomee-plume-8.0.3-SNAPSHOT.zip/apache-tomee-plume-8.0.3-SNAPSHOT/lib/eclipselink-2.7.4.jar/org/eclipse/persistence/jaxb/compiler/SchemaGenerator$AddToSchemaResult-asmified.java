package asm.org.eclipse.persistence.jaxb.compiler;
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
public class SchemaGenerator$AddToSchemaResultDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$AddToSchemaResult", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/compiler/SchemaGenerator$AddToSchemaResult", "org/eclipse/persistence/jaxb/compiler/SchemaGenerator", "AddToSchemaResult", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "type", "Lorg/eclipse/persistence/internal/oxm/schema/model/ComplexType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "particle", "Lorg/eclipse/persistence/internal/oxm/schema/model/TypeDefParticle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "schema", "Lorg/eclipse/persistence/internal/oxm/schema/model/Schema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "simpleContentType", "Lorg/eclipse/persistence/internal/oxm/schema/model/ComplexType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/oxm/schema/model/TypeDefParticle;Lorg/eclipse/persistence/internal/oxm/schema/model/Schema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$AddToSchemaResult", "particle", "Lorg/eclipse/persistence/internal/oxm/schema/model/TypeDefParticle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$AddToSchemaResult", "schema", "Lorg/eclipse/persistence/internal/oxm/schema/model/Schema;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/oxm/schema/model/TypeDefParticle;Lorg/eclipse/persistence/internal/oxm/schema/model/ComplexType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$AddToSchemaResult", "particle", "Lorg/eclipse/persistence/internal/oxm/schema/model/TypeDefParticle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/compiler/SchemaGenerator$AddToSchemaResult", "type", "Lorg/eclipse/persistence/internal/oxm/schema/model/ComplexType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
