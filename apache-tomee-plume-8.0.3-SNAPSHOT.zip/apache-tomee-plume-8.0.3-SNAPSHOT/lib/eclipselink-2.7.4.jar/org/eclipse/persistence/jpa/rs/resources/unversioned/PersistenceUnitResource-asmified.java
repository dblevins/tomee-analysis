package asm.org.eclipse.persistence.jpa.rs.resources.unversioned;
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
public class PersistenceUnitResourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", null, "org/eclipse/persistence/jpa/rs/resources/common/AbstractPersistenceUnitResource", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Produces;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, "application/json");
annotationVisitor1.visit(null, "application/xml");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Consumes;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, "application/json");
annotationVisitor1.visit(null, "application/xml");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/ws/rs/Path;", true);
annotationVisitor0.visit("value", "/{context}/metadata/");
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/rs/resources/common/AbstractPersistenceUnitResource", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescriptorMetadata", "(Ljava/lang/String;Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/ws/rs/GET;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/ws/rs/Path;", true);
annotationVisitor0.visit("value", "entity/{descriptorAlias}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "descriptorAlias");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "getDescriptorMetadataInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypes", "(Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/ws/rs/GET;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "getTypesInternal", "(Ljava/lang/String;Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueriesMetadata", "(Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/ws/rs/GET;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/ws/rs/Path;", true);
annotationVisitor0.visit("value", "query");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "getQueriesMetadataInternal", "(Ljava/lang/String;Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryMetadata", "(Ljava/lang/String;Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/ws/rs/GET;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/ws/rs/Path;", true);
annotationVisitor0.visit("value", "query/{queryName}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "queryName");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljavax/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/unversioned/PersistenceUnitResource", "getQueryMetadataInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljavax/ws/rs/core/HttpHeaders;Ljavax/ws/rs/core/UriInfo;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
