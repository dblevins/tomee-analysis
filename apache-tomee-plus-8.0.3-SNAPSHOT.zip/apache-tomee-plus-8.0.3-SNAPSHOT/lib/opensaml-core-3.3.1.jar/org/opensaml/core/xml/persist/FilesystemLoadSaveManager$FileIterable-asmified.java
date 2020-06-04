package asm.org.opensaml.core.xml.persist;
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
public class FilesystemLoadSaveManager$FileIterableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterable", "Ljava/lang/Object;Ljava/lang/Iterable<Lnet/shibboleth/utilities/java/support/collection/Pair<Ljava/lang/String;TT;>;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitInnerClass("org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterable", "org/opensaml/core/xml/persist/FilesystemLoadSaveManager", "FileIterable", ACC_PRIVATE);

classWriter.visitInnerClass("org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterator", "org/opensaml/core/xml/persist/FilesystemLoadSaveManager", "FileIterator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keys", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/core/xml/persist/FilesystemLoadSaveManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/core/xml/persist/FilesystemLoadSaveManager;Ljava/util/Collection;)V", "(Ljava/util/Collection<Ljava/lang/String;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterable", "this$0", "Lorg/opensaml/core/xml/persist/FilesystemLoadSaveManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterable", "keys", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterable", "keys", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Predicates", "notNull", "()Lcom/google/common/base/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Collections2", "filter", "(Ljava/util/Collection;Lcom/google/common/base/Predicate;)Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lnet/shibboleth/utilities/java/support/collection/Pair<Ljava/lang/String;TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterable", "this$0", "Lorg/opensaml/core/xml/persist/FilesystemLoadSaveManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterable", "keys", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/persist/FilesystemLoadSaveManager$FileIterator", "<init>", "(Lorg/opensaml/core/xml/persist/FilesystemLoadSaveManager;Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
