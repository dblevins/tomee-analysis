package asm.org.eclipse.persistence.core.mappings.converters;
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
public class CoreConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/core/mappings/converters/CoreConverter", "<MAPPING:Lorg/eclipse/persistence/core/mappings/CoreMapping;SESSION::Lorg/eclipse/persistence/core/sessions/CoreSession;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertObjectValueToDataValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/core/sessions/CoreSession;)Ljava/lang/Object;", "(Ljava/lang/Object;TSESSION;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertDataValueToObjectValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/core/sessions/CoreSession;)Ljava/lang/Object;", "(Ljava/lang/Object;TSESSION;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initialize", "(Lorg/eclipse/persistence/core/mappings/CoreMapping;Lorg/eclipse/persistence/core/sessions/CoreSession;)V", "(TMAPPING;TSESSION;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
