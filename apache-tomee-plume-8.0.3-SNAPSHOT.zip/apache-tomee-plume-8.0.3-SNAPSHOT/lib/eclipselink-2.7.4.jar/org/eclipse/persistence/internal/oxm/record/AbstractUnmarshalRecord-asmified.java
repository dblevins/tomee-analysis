package asm.org.eclipse.persistence.internal.oxm.record;
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
public class AbstractUnmarshalRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractUnmarshalRecord", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;UNMARSHALLER:Lorg/eclipse/persistence/internal/oxm/Unmarshaller;>Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/record/XMLRecord<TABSTRACT_SESSION;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/record/XMLRecord" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;)Ljava/lang/Object;", "(TFIELD;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUnmarshaller", "()Lorg/eclipse/persistence/internal/oxm/Unmarshaller;", "()TUNMARSHALLER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveNamespacePrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
