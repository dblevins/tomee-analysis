package asm.org.eclipse.persistence.jpa.metadata;
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
public class MetadataSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jpa/metadata/MetadataSource", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPropertyOverrides", "(Ljava/util/Map;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Ljava/util/Map;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEntityMappings", "(Ljava/util/Map;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/ClassLoader;Lorg/eclipse/persistence/logging/SessionLog;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
