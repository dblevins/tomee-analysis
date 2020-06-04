package asm.org.eclipse.persistence.jpa.rs.resources;
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
public class EntityResourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jpa/rs/resources/EntityResource", null, "org/eclipse/persistence/jpa/rs/resources/common/AbstractEntityResource", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ws/rs/Produces;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, "application/json");
annotationVisitor1.visit(null, "application/xml");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ws/rs/Consumes;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, "application/json");
annotationVisitor1.visit(null, "application/xml");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "/{version : v\\d\\.\\d|latest}/{context}/entity/");
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/rs/resources/common/AbstractEntityResource", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/GET;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{type}/{id}/{attribute}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(7, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "type");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "id");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "attribute");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(5, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(6, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "findAttributeInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "find", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/GET;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{type}/{id}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(6, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "type");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "id");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(5, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "findInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;Ljava/io/InputStream;)Ljakarta/ws/rs/core/Response;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/PUT;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{type}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(6, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "type");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "createInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;Ljava/io/InputStream;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;Ljava/io/InputStream;)Ljakarta/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/POST;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{type}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(6, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "type");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "updateInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;Ljava/io/InputStream;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOrAddAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;Ljava/io/InputStream;)Ljakarta/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/POST;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{type}/{id}/{attribute}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(8, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "type");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "id");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "attribute");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(5, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(6, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setOrAddAttributeInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;Ljava/io/InputStream;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/DELETE;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{type}/{id}/{attribute}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(7, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "type");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "id");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "attribute");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(5, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(6, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "removeAttributeInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delete", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/DELETE;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{type}/{id}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(6, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "type");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "id");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(5, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "deleteInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityOptions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/OPTIONS;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/Path;", true);
annotationVisitor0.visit("value", "{entityName}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(5, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "version");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "context");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/ws/rs/PathParam;", true);
annotationVisitor0.visit("value", "entityName");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "setRequestUniqueId", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/rs/resources/EntityResource", "buildEntityOptionsResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljakarta/ws/rs/core/HttpHeaders;Ljakarta/ws/rs/core/UriInfo;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
