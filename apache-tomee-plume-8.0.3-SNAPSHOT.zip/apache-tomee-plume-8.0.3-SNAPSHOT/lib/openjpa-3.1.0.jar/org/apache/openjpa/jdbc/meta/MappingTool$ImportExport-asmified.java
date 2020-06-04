package asm.org.apache.openjpa.jdbc.meta;
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
public class MappingTool$ImportExportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/jdbc/meta/MappingTool$ImportExport", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/MappingTool$ImportExport", "org/apache/openjpa/jdbc/meta/MappingTool", "ImportExport", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "importMappings", "(Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;[Ljava/lang/Class;[Ljava/lang/String;ZLorg/apache/openjpa/lib/log/Log;Ljava/lang/ClassLoader;)Z", "(Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;[Ljava/lang/Class<*>;[Ljava/lang/String;ZLorg/apache/openjpa/lib/log/Log;Ljava/lang/ClassLoader;)Z", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "exportMappings", "(Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;[Ljava/lang/Class;ZLorg/apache/openjpa/lib/log/Log;Ljava/io/Writer;)Z", "(Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;[Ljava/lang/Class<*>;ZLorg/apache/openjpa/lib/log/Log;Ljava/io/Writer;)Z", new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
