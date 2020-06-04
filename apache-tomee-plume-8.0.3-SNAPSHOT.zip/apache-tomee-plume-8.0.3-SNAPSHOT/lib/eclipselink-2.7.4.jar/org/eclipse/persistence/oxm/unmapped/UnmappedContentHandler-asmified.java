package asm.org.eclipse.persistence.oxm.unmapped;
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
public class UnmappedContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/oxm/unmapped/UnmappedContentHandler", "Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/unmapped/UnmappedContentHandler<Lorg/eclipse/persistence/oxm/record/UnmarshalRecord;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/unmapped/UnmappedContentHandler" });

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
