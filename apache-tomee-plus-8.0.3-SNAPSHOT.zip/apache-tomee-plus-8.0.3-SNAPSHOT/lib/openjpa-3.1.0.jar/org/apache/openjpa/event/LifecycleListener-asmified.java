package asm.org.apache.openjpa.event;
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
public class LifecycleListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/event/LifecycleListener", null, "java/lang/Object", new String[] { "org/apache/openjpa/event/PersistListener", "org/apache/openjpa/event/LoadListener", "org/apache/openjpa/event/StoreListener", "org/apache/openjpa/event/ClearListener", "org/apache/openjpa/event/DeleteListener", "org/apache/openjpa/event/DirtyListener", "org/apache/openjpa/event/DetachListener", "org/apache/openjpa/event/AttachListener" });

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
