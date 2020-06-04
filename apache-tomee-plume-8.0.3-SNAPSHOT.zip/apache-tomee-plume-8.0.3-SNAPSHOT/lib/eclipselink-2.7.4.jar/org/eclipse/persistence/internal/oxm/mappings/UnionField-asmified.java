package asm.org.eclipse.persistence.internal.oxm.mappings;
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
public class UnionFieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/mappings/UnionField", "<CONVERSION_MANAGER::Lorg/eclipse/persistence/internal/oxm/ConversionManager;NAMESPACE_RESOLVER:Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;>Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/mappings/Field<TCONVERSION_MANAGER;TNAMESPACE_RESOLVER;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/mappings/Field" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSchemaType", "(Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchemaTypes", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
