package org.example.boardback.dto.board.file;

import lombok.Builder;
import lombok.Getter;
import org.example.boardback.entity.file.FileInfo;

@Getter
@Builder
public class BoardFileListDto {
    public Long fileId;
    private String originalName;
    private String storedName;
    private String contentType;
    private Long fileSize;
    private String downloadUrl;

    public static BoardFileListDto formEntity(FileInfo fileInfo, String baseDownLoadUrl) {
        if (fileInfo == null) return null;

        return BoardFileListDto.builder()
                .fileId(fileInfo.getId())
                .originalName(fileInfo.getOriginalName())
                .storedName(fileInfo.getStoredName())
                .contentType(fileInfo.getContentType())
                .fileSize(fileInfo.getFileSize())
                .downloadUrl(baseDownLoadUrl + fileInfo.getId())
                .build();
    }
}
