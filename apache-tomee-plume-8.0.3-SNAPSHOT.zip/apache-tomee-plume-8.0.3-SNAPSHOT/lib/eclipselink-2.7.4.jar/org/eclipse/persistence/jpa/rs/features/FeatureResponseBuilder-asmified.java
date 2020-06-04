package asm.org.eclipse.persistence.jpa.rs.features;
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
public class FeatureResponseBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jpa/rs/features/FeatureResponseBuilder", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildReadAllQueryResponse", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map;Ljava/util/List;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/List<Ljava/lang/Object;>;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildReportQueryResponse", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/List<[Ljava/lang/Object;>;Ljava/util/List<Lorg/eclipse/persistence/internal/queries/ReportItem;>;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildSingleEntityResponse", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map;Ljava/lang/Object;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/Object;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildAttributeResponse", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/Object;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildSingleResultQueryResponse", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map;Ljava/lang/Object;Ljava/util/List;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", "(Lorg/eclipse/persistence/jpa/rs/PersistenceContext;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/Object;Ljava/util/List<Lorg/eclipse/persistence/internal/queries/ReportItem;>;Ljakarta/ws/rs/core/UriInfo;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
